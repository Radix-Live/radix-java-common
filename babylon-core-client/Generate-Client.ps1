$generator = 'openapi-generator-cli.jar'
if (-not(Test-Path -Path $generator -PathType Leaf)) {
     Invoke-WebRequest -OutFile $generator https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.6.0/openapi-generator-cli-6.6.0.jar
}

java -jar openapi-generator-cli.jar generate -g java -i core-api-schema.yaml -p "dateLibrary=java8,library=apache-httpclient,apiPackage=live.radix.core.client,modelPackage=live.radix.core.model,invokerPackage=live.radix.core,groupId=live.radix,artifactId=babylon-core-client,artifactDescription=Radix Babylon API Core Client,booleanGetterPrefix=is,developerEmail=hello@radixdlt.com,developerName=Radix,developerOrganization=Radix,developerOrganizationUrl=https://radixdlt.com,disallowAdditionalPropertiesIfNotPresent=false,snapshotVersion=false"
