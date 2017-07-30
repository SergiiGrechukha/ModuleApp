package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1292 {

    @Ignore    private SampleClass1293 sampleClass;

    public SampleClass1292(){
        sampleClass = new SampleClass1293();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}