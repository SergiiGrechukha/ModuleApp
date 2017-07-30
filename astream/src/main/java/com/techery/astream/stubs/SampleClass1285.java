package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1285 {

    @Ignore    private SampleClass1286 sampleClass;

    public SampleClass1285(){
        sampleClass = new SampleClass1286();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}