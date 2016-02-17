var crudAtendimento = angular.module('crudAtendimento', ["ngResource"]);

crudAtendimento.controller("AtendimentoController", ["$resource", "$scope", function($resource, $scope) {
	
	var angularResource = $resource("/SistemaAtendimento/ws/atendimento");
	var angularResourceParam = $resource("/SistemaAtendimento/ws/atendimento/:protocolo", {protocolo : "@protocolo"});
	
	$scope.atendimentos = angularResource.query(function(){});
	
	$scope.salvar = function() {
		var newResource = new angularResource($scope.atendimento);
		newResource.$save(function(){
			$scope.atendimentos.push(newResource);
			$scope.novo(); 
		});
	}
	
	$scope.editar = function() {
		var newResource = new angularResource($scope.atendimento);
		newResource.$save(function(){
			$scope.novo(); 
		});
	}
	
	$scope.excluir = function() {
		var newResource = new angularResourceParam($scope.atendimento);
		newResource.$delete(function() {
			$scope.atendimentos.splice($scope.atendimentos.indexOf($scope.atendimento), 1);
			$scope.novo();  
		});
	}
	
	$scope.novo = function () { 
		$scope.atendimento = "";
	}; 	
	
	$scope.seleciona = function (atendimento) {
		$scope.atendimento = atendimento; 								  
	};	
	
}])