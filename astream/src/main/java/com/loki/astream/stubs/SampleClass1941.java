package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1941 {

    @Ignore    private SampleClass1942 sampleClass;

    public SampleClass1941(){
        sampleClass = new SampleClass1942();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}