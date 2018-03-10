angular.module("indexView",['ui.router'])
.config(function ($stateProvider) {
    var registerView={
        name:'register',
        url:'/register',
        templateUrl:'registerPage.html'
    }


    $stateProvider.state(registerView);
});
