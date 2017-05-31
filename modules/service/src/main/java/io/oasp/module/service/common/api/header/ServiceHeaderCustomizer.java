package io.oasp.module.service.common.api.header;

/**
 * This interface may be implemented to {@link #addHeaders(ServiceHeaderContext) customize the headers}. When a
 * {@link io.oasp.module.service.common.api.ServiceClientFactory#create(Class) service client} is invoked these headers
 * are applied to the underlying protocol when a remote invocation is triggered via the network. Multiple
 * implementations of this interface may exist as spring beans for different aspects (e.g. passing a JWT/OAuth security
 * token for authentication, passing
 */
public interface ServiceHeaderCustomizer {

  /**
   * @param context the {@link ServiceHeaderContext} that may be used to
   *        {@link ServiceHeaderContext#setHeader(String, String) tweak headers}.
   */
  void addHeaders(ServiceHeaderContext<?> context);

}
