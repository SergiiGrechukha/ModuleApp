package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass922 {

    @Ignore    private SampleClass923 sampleClass;

    public SampleClass922(){
        sampleClass = new SampleClass923();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}