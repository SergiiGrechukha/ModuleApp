package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1302 {

    @Ignore    private SampleClass1303 sampleClass;

    public SampleClass1302(){
        sampleClass = new SampleClass1303();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}