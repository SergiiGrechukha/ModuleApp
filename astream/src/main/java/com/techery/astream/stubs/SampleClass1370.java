package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1370 {

    @Ignore    private SampleClass1371 sampleClass;

    public SampleClass1370(){
        sampleClass = new SampleClass1371();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}