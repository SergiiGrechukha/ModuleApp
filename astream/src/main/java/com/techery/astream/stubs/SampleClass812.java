package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass812 {

    @Ignore    private SampleClass813 sampleClass;

    public SampleClass812(){
        sampleClass = new SampleClass813();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}