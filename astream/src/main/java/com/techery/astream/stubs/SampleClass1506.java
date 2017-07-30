package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1506 {

    @Ignore    private SampleClass1507 sampleClass;

    public SampleClass1506(){
        sampleClass = new SampleClass1507();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}