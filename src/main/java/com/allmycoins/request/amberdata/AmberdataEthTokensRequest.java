package com.allmycoins.request.amberdata;

import java.util.Map;

import com.allmycoins.json.amberdata.AmberdataEthTokensJson;
import com.allmycoins.request.GetRequest;
import com.allmycoins.utils.RequestUtils;

public final class AmberdataEthTokensRequest implements GetRequest<AmberdataEthTokensJson> {

	private final String ethAddress;

	public AmberdataEthTokensRequest(String pEthAddress) {
		ethAddress = pEthAddress;
	}

	@Override
	public String baseUrl() {
		return "https://web3api.io";
	}

	@Override
	public String endPoint() {
		return "/api/v2/addresses/" + ethAddress + "/token-balances/latest";
	}

	@Override
	public Map<String, String> headers() {
		return Map.of("x-api-key", "UAKcaf21697061776a575228db2a55e4990");
	}

	@Override
	public Class<AmberdataEthTokensJson> jsonResponseClass() {
		return AmberdataEthTokensJson.class;
	}

	@Override
	public String parameters() {
		return RequestUtils.buildParameters(Map.of("includePrice", "true"));
	}

}