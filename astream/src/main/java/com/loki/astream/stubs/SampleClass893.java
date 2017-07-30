package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass893 {

    @Ignore    private SampleClass894 sampleClass;

    public SampleClass893(){
        sampleClass = new SampleClass894();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}