package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1653 {

    @Ignore    private SampleClass1654 sampleClass;

    public SampleClass1653(){
        sampleClass = new SampleClass1654();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}