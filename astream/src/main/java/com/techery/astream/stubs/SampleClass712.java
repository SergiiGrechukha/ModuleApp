package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass712 {

    @Ignore    private SampleClass713 sampleClass;

    public SampleClass712(){
        sampleClass = new SampleClass713();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}