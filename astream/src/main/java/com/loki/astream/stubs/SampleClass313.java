package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass313 {

    @Ignore    private SampleClass314 sampleClass;

    public SampleClass313(){
        sampleClass = new SampleClass314();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}