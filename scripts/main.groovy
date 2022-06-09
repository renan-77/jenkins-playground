def executeTests() {
    sh 'python3 -m unittest'
}

def build(){
    echo 'Building'    
}

def deploy(){
    echo "Deploying version ${params.VERSION}"
}

return this