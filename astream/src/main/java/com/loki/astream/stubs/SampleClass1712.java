package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1712 {

    @Ignore    private SampleClass1713 sampleClass;

    public SampleClass1712(){
        sampleClass = new SampleClass1713();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}