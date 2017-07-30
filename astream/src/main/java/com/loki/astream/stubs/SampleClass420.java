package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass420 {

    @Ignore    private SampleClass421 sampleClass;

    public SampleClass420(){
        sampleClass = new SampleClass421();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}