package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1274 {

    @Ignore    private SampleClass1275 sampleClass;

    public SampleClass1274(){
        sampleClass = new SampleClass1275();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}