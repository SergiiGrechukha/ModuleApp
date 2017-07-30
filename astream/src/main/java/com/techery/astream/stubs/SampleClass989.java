package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass989 {

    @Ignore    private SampleClass990 sampleClass;

    public SampleClass989(){
        sampleClass = new SampleClass990();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}