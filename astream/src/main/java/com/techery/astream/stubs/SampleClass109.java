package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass109 {

    @Ignore    private SampleClass110 sampleClass;

    public SampleClass109(){
        sampleClass = new SampleClass110();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}