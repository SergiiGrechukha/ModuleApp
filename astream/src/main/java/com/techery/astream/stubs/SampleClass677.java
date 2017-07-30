package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass677 {

    @Ignore    private SampleClass678 sampleClass;

    public SampleClass677(){
        sampleClass = new SampleClass678();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}