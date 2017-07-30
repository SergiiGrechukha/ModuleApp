package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1216 {

    @Ignore    private SampleClass1217 sampleClass;

    public SampleClass1216(){
        sampleClass = new SampleClass1217();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}