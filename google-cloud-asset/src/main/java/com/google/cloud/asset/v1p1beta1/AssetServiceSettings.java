/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.asset.v1p1beta1;

import static com.google.cloud.asset.v1p1beta1.AssetServiceClient.SearchAllIamPoliciesPagedResponse;
import static com.google.cloud.asset.v1p1beta1.AssetServiceClient.SearchAllResourcesPagedResponse;
import static com.google.cloud.asset.v1p1beta1.AssetServiceClient.SearchIamPoliciesPagedResponse;
import static com.google.cloud.asset.v1p1beta1.AssetServiceClient.SearchResourcesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.asset.v1p1beta1.stub.AssetServiceStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AssetServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudasset.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of searchResources to 30 seconds:
 *
 * <pre>
 * <code>
 * AssetServiceSettings.Builder assetServiceSettingsBuilder =
 *     AssetServiceSettings.newBuilder();
 * assetServiceSettingsBuilder.searchResourcesSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AssetServiceSettings assetServiceSettings = assetServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AssetServiceSettings extends ClientSettings<AssetServiceSettings> {
  /** Returns the object with the settings used for calls to searchResources. */
  public PagedCallSettings<
          SearchResourcesRequest, SearchResourcesResponse, SearchResourcesPagedResponse>
      searchResourcesSettings() {
    return ((AssetServiceStubSettings) getStubSettings()).searchResourcesSettings();
  }

  /** Returns the object with the settings used for calls to searchIamPolicies. */
  public PagedCallSettings<
          SearchIamPoliciesRequest, SearchIamPoliciesResponse, SearchIamPoliciesPagedResponse>
      searchIamPoliciesSettings() {
    return ((AssetServiceStubSettings) getStubSettings()).searchIamPoliciesSettings();
  }

  /** Returns the object with the settings used for calls to searchAllResources. */
  public PagedCallSettings<
          SearchAllResourcesRequest, SearchAllResourcesResponse, SearchAllResourcesPagedResponse>
      searchAllResourcesSettings() {
    return ((AssetServiceStubSettings) getStubSettings()).searchAllResourcesSettings();
  }

  /** Returns the object with the settings used for calls to searchAllIamPolicies. */
  public PagedCallSettings<
          SearchAllIamPoliciesRequest,
          SearchAllIamPoliciesResponse,
          SearchAllIamPoliciesPagedResponse>
      searchAllIamPoliciesSettings() {
    return ((AssetServiceStubSettings) getStubSettings()).searchAllIamPoliciesSettings();
  }

  public static final AssetServiceSettings create(AssetServiceStubSettings stub)
      throws IOException {
    return new AssetServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AssetServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AssetServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AssetServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AssetServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AssetServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AssetServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AssetServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AssetServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AssetServiceSettings. */
  public static class Builder extends ClientSettings.Builder<AssetServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(AssetServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(AssetServiceStubSettings.newBuilder());
    }

    protected Builder(AssetServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AssetServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public AssetServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((AssetServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to searchResources. */
    public PagedCallSettings.Builder<
            SearchResourcesRequest, SearchResourcesResponse, SearchResourcesPagedResponse>
        searchResourcesSettings() {
      return getStubSettingsBuilder().searchResourcesSettings();
    }

    /** Returns the builder for the settings used for calls to searchIamPolicies. */
    public PagedCallSettings.Builder<
            SearchIamPoliciesRequest, SearchIamPoliciesResponse, SearchIamPoliciesPagedResponse>
        searchIamPoliciesSettings() {
      return getStubSettingsBuilder().searchIamPoliciesSettings();
    }

    /** Returns the builder for the settings used for calls to searchAllResources. */
    public PagedCallSettings.Builder<
            SearchAllResourcesRequest, SearchAllResourcesResponse, SearchAllResourcesPagedResponse>
        searchAllResourcesSettings() {
      return getStubSettingsBuilder().searchAllResourcesSettings();
    }

    /** Returns the builder for the settings used for calls to searchAllIamPolicies. */
    public PagedCallSettings.Builder<
            SearchAllIamPoliciesRequest,
            SearchAllIamPoliciesResponse,
            SearchAllIamPoliciesPagedResponse>
        searchAllIamPoliciesSettings() {
      return getStubSettingsBuilder().searchAllIamPoliciesSettings();
    }

    @Override
    public AssetServiceSettings build() throws IOException {
      return new AssetServiceSettings(this);
    }
  }
}