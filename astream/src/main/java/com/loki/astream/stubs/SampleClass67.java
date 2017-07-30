package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass67 {

    @Ignore    private SampleClass68 sampleClass;

    public SampleClass67(){
        sampleClass = new SampleClass68();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}