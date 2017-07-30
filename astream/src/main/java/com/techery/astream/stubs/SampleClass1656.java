package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1656 {

    @Ignore    private SampleClass1657 sampleClass;

    public SampleClass1656(){
        sampleClass = new SampleClass1657();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}