package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass8 {

    @Ignore    private SampleClass9 sampleClass;

    public SampleClass8(){
        sampleClass = new SampleClass9();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}