package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1327 {

    @Ignore    private SampleClass1328 sampleClass;

    public SampleClass1327(){
        sampleClass = new SampleClass1328();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}