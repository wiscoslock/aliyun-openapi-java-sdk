/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.simple;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

public class DescribeRegionsSample {
	
	
	
	public static void main(String args[]) {
		DefaultProfile profile = DefaultProfile.getProfile("cn-beijing",
				FiledCredentialProvider.getICredentialProvider());
		DescribeRegionsRequest request = new DescribeRegionsRequest();
		
		DefaultAcsClient client = new DefaultAcsClient(profile);
		
		try {
			DescribeRegionsResponse response = client.getAcsResponse(request);
			System.out.print(response.getRegions().size());
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		}
	}
}
