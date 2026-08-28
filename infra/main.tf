provider "azurerm" {
  features {}
}

resource "azurerm_resource_group" "rg" {
  name     = "orchestrator-rg"
  location = "East US"
}

resource "azurerm_kubernetes_cluster" "aks" {
  name                = "orchestrator-aks"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  dns_prefix          = "orchestrator"

  default_node_pool {
    name       = "default"
    node_count = 2
    vm_size    = "Standard_DS2_v2"
  }

  identity {
    type = "SystemAssigned"
  }
}
