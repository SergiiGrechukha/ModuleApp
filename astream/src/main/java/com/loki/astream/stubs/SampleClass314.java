package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass314 {

    @Ignore    private SampleClass315 sampleClass;

    public SampleClass314(){
        sampleClass = new SampleClass315();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}