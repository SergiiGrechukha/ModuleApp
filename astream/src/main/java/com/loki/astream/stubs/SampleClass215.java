package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass215 {

    @Ignore    private SampleClass216 sampleClass;

    public SampleClass215(){
        sampleClass = new SampleClass216();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}