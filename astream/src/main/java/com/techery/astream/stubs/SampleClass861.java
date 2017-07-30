package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass861 {

    @Ignore    private SampleClass862 sampleClass;

    public SampleClass861(){
        sampleClass = new SampleClass862();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}