package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass975 {

    @Ignore    private SampleClass976 sampleClass;

    public SampleClass975(){
        sampleClass = new SampleClass976();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}