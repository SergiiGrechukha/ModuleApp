package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1314 {

    @Ignore    private SampleClass1315 sampleClass;

    public SampleClass1314(){
        sampleClass = new SampleClass1315();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}