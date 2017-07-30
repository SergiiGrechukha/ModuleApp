package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1394 {

    @Ignore    private SampleClass1395 sampleClass;

    public SampleClass1394(){
        sampleClass = new SampleClass1395();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}