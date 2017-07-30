package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1259 {

    @Ignore    private SampleClass1260 sampleClass;

    public SampleClass1259(){
        sampleClass = new SampleClass1260();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}