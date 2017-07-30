package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass838 {

    @Ignore    private SampleClass839 sampleClass;

    public SampleClass838(){
        sampleClass = new SampleClass839();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}