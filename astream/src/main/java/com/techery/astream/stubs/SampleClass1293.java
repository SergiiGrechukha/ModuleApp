package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1293 {

    @Ignore    private SampleClass1294 sampleClass;

    public SampleClass1293(){
        sampleClass = new SampleClass1294();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}