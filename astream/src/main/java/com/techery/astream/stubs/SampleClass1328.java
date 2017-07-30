package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1328 {

    @Ignore    private SampleClass1329 sampleClass;

    public SampleClass1328(){
        sampleClass = new SampleClass1329();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}