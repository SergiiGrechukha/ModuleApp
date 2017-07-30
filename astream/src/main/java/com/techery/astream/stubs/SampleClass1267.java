package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1267 {

    @Ignore    private SampleClass1268 sampleClass;

    public SampleClass1267(){
        sampleClass = new SampleClass1268();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}