$generator = 'openapi-generator-cli.jar'
if (-not(Test-Path -Path $generator -PathType Leaf)) {
     Invoke-WebRequest -OutFile $generator https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.7.0/openapi-generator-cli-7.7.0.jar
}

rm src -r -fo
rm docs -r -fo
rm build -r -fo

java -jar openapi-generator-cli.jar generate -g java -i gateway-api-schema.yaml -p "dateLibrary=java8,library=apache-httpclient,apiPackage=live.radix.gateway.client,modelPackage=live.radix.gateway.model,invokerPackage=live.radix.gateway,groupId=live.radix,artifactId=babylon-gateway-client,artifactDescription=Radix Babylon API Gateway Client,booleanGetterPrefix=is,developerEmail=hello@radixdlt.com,developerName=Radix,developerOrganization=Radix,developerOrganizationUrl=https://radixdlt.com,disallowAdditionalPropertiesIfNotPresent=false,snapshotVersion=false"
