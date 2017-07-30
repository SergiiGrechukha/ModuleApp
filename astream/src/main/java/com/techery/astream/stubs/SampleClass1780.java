package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1780 {

    @Ignore    private SampleClass1781 sampleClass;

    public SampleClass1780(){
        sampleClass = new SampleClass1781();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}