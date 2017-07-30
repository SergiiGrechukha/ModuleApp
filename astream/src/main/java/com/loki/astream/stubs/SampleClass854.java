package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass854 {

    @Ignore    private SampleClass855 sampleClass;

    public SampleClass854(){
        sampleClass = new SampleClass855();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}