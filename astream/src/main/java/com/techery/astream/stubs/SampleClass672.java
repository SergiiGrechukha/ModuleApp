package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass672 {

    @Ignore    private SampleClass673 sampleClass;

    public SampleClass672(){
        sampleClass = new SampleClass673();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}