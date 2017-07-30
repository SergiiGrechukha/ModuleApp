package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass751 {

    @Ignore    private SampleClass752 sampleClass;

    public SampleClass751(){
        sampleClass = new SampleClass752();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}