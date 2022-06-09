def executeTests() {
    echo 'tests will be executed here'
}

def build(){
    echo 'Building'    
}

def deploy(){
    echo "Deploying version ${params.VERSION}"
}

return this