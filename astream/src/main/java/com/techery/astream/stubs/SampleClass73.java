package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass73 {

    @Ignore    private SampleClass74 sampleClass;

    public SampleClass73(){
        sampleClass = new SampleClass74();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}