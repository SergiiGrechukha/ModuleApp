package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass894 {

    @Ignore    private SampleClass895 sampleClass;

    public SampleClass894(){
        sampleClass = new SampleClass895();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}