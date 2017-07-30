package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass830 {

    @Ignore    private SampleClass831 sampleClass;

    public SampleClass830(){
        sampleClass = new SampleClass831();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}