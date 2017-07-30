package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1640 {

    @Ignore    private SampleClass1641 sampleClass;

    public SampleClass1640(){
        sampleClass = new SampleClass1641();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}