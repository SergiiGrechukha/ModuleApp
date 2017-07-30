package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1734 {

    @Ignore    private SampleClass1735 sampleClass;

    public SampleClass1734(){
        sampleClass = new SampleClass1735();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}